package com.codegym.webservice.controller;

import com.codegym.dao.dto.FloorDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Floor;
import com.codegym.web.services.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/floors")
public class FloorController {
    @Autowired
    private FloorService floorService;

    @GetMapping("")
    public List<Floor> getAllFloor() {
        List<Floor> floors;
        floors = floorService.findAllByDeleteFlagIsNull();
        return floors;
    }
//    @GetMapping(value = "/paging", params = {"page", "size", "search"})
//    public Page<Floor> getListFloor(@RequestParam("page") int page,
//                                          @RequestParam("size") int size,
//                                          @RequestParam("search") String name) {
//        Page<Floor> floors;
//        floors= floorService.getFloors(name, PageRequest.of(page,size));
//        return floors;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<FloorDTO> getFloor(@PathVariable("id") int id) {
        FloorDTO floorDTO = floorService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (floorDTO != null) {
            return ResponseEntity.ok(floorDTO);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteBuilding(@PathVariable("id") int id) {
        FloorDTO floor = floorService.findAllByDeleteFlagIsNullAndIdIs(id);
        floorService.remove(floor.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return response;
    }
    @PostMapping("")
    public ResponseEntity<FloorDTO> createFloor(@RequestBody FloorDTO floorDTO) {
        floorService.save(floorDTO);
        return ResponseEntity.ok(floorDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<FloorDTO> updateFloor(@PathVariable(value = "id") Integer id, @RequestBody FloorDTO floorDTO) {
        floorService.updateFloor(floorDTO);
        return ResponseEntity.ok(floorDTO);
    }
}
