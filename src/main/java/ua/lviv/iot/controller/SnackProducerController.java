package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.models.converter.SnackProducerConverter;
import ua.lviv.iot.models.domain.snack.SnackProducer;
import ua.lviv.iot.models.dto.snack.SnackProducerDTO;
import ua.lviv.iot.service.FullAddressService;
import ua.lviv.iot.service.SnackProducerService;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/snack_producer")
public class SnackProducerController {
    @Autowired
    SnackProducerService snackProducerService;

    @Autowired
    FullAddressService fullAddressService;

    @GetMapping
    public ResponseEntity<List<SnackProducerDTO>> getSnackProducerList() {
        List<SnackProducerDTO> responseSnackProducerDtoList = new LinkedList<>();
        for (SnackProducer snackProducer: snackProducerService.getAll()) {
            responseSnackProducerDtoList.add(SnackProducerConverter.toDTO(snackProducer));
        }
        return new ResponseEntity<>(responseSnackProducerDtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<SnackProducerDTO> getSnackProducer(@PathVariable Integer id) {
        try {
            SnackProducer searchedSnackProducer = snackProducerService.getById(id);
            return new ResponseEntity<>(SnackProducerConverter.toDTO(searchedSnackProducer), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<SnackProducerDTO> postSnackProducer(@RequestBody SnackProducerDTO snackProducerDTO) {
        SnackProducer createdSnackProducer = SnackProducer.builder()
                .name(snackProducerDTO.getName())
                .email(snackProducerDTO.getEmail())
                .mobilePhone(snackProducerDTO.getMobilePhone())
                .build();
       try {
           createdSnackProducer.setFullAddress(fullAddressService.getById(snackProducerDTO.getFullAddressId()));
       } catch (NoSuchElementException e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }
       SnackProducer responseSnackProducer = snackProducerService.create(createdSnackProducer);
       return new ResponseEntity<>(SnackProducerConverter.toDTO(responseSnackProducer), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<SnackProducerDTO> putSnackProducer(
            @RequestBody SnackProducerDTO snackProducerDTO, @PathVariable Integer id) {
        try {
            SnackProducer snackProducer = SnackProducer.builder()
                    .name(snackProducerDTO.getName())
                    .mobilePhone(snackProducerDTO.getMobilePhone())
                    .email(snackProducerDTO.getEmail())
                    .build();
            try {
                snackProducer.setFullAddress(fullAddressService.getById(id));
            } catch (NoSuchElementException e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            snackProducerService.updateById(snackProducer, id);
            snackProducerDTO.setId(id);
            return new ResponseEntity<>(SnackProducerConverter.toDTO(snackProducer), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<SnackProducerDTO> deleteSnackProducer(@PathVariable Integer id) {
        try {
            snackProducerService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
