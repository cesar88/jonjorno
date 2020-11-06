package com.joncorno.commons.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.joncorno.commons.dto.BaseDTO;
import com.joncorno.commons.dto.FilterDTO;

import java.util.List;

/**
 * Base client interface sınıfı.
 *
 * @param <D> parametresi.
 * @author Fatih Goken
 */
@Service
public interface BaseClient<D extends BaseDTO> {

    /**
     * Find by id response entity.
     *
     * @param id id
     * @return response entity
     */
    @GetMapping(value = "/findById/{id}")
    ResponseEntity<D> findById(@PathVariable(value = "id") Long id);

    /**
     * Find all response entity.
     *
     * @return response entity
     */
    @GetMapping(value = "/findAll")
    ResponseEntity<List<D>> findAll();

    /**
     * Kaydet response entity.
     *
     * @param d d
     * @return response entity
     */
    @PostMapping(path = "/save")
    ResponseEntity<D> save(@RequestBody D d);

    /**
     * Liste save response entity.
     *
     * @param d d
     * @return response entity
     */
    @PostMapping(path = "/saveList")
    ResponseEntity<List<D>> saveList(@RequestBody List<D> d);

    /**
     * Find all by active response entity.
     *
     * @param active active
     * @return response entity
     */
    @GetMapping(value = "/findAllByActive/{active}")
    ResponseEntity<List<D>> findAllByActive(@PathVariable("active") Integer active);

    /**
     * Find all response entity.
     *
     * @param page page
     * @param size size
     * @return response entity
     */
    @GetMapping(value = "/findAll/{page}/{size}")
    ResponseEntity<List<D>> findAll(@PathVariable(value = "page") Integer page,
                                    @PathVariable(value = "size") Integer size);

    /**
     * Find all by active response entity.
     *
     * @param active active
     * @param page  page
     * @param size  size
     * @return response entity
     */
    @GetMapping(value = "/findAllByActive/{active}/{page}/{size}")
    ResponseEntity<List<D>> findAllByActive(
            @PathVariable(value = "active") Integer active,
            @PathVariable(value = "page") Integer page,
            @PathVariable(value = "size") Integer size
    );

    /**
     * Update response entity.
     *
     * @param d d
     * @return response entity
     */
    @PutMapping(value = "/update")
    ResponseEntity<D> update(@RequestBody D d);

    /**
     * Count response entity.
     *
     * @return response entity
     */
    @GetMapping(path = "/count")
    ResponseEntity<Long> count();

    /**
     * Count by active response entity.
     *
     * @param active active
     * @return response entity
     */
    @GetMapping(path = "/countByActive/{active}")
    ResponseEntity<Long> countByActive(@PathVariable(value = "active") Integer active);

    /**
     * Delete.
     *
     * @param d d
     */
    @PostMapping(value = "/delete")
    void delete(@RequestBody D d);

    /**
     * Find all by filter response entity.
     *
     * @param filterDTO filter dto
     * @return response entity
     */
    @PostMapping(path = "/findAllByFilter")
    ResponseEntity<List<D>> findAllByFilter(@RequestBody FilterDTO filterDTO);

    /**
     * Count by filter response entity.
     *
     * @param filterDTO filter dto
     * @return response entity
     */
    @PostMapping(path = "/countByFilter")
    ResponseEntity<Long> countByFilter(@RequestBody FilterDTO filterDTO);

}
