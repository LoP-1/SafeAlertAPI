package com.apiSafeAlert.SafeAlert.Controller;

import com.apiSafeAlert.SafeAlert.Repository.MarkRepository;
import com.apiSafeAlert.SafeAlert.model.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/markers")
public class MarkController {

    @Autowired
    private MarkRepository markerRepository;

    @GetMapping
    public List<Marker> getAllMarkers() {
        return markerRepository.findAll();
    }

    @PostMapping
    public Marker createMarker(@RequestBody Marker marker) {
        return markerRepository.save(marker);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marker> getMarkerById(@PathVariable Long id) {
        Optional<Marker> marker = markerRepository.findById(id);
        if (marker.isPresent()) {
            return ResponseEntity.ok(marker.get());
        } else {
            return ResponseEntity.status(404).build();  // Retorna 404 si no se encuentra el marcador
        }
    }
}
