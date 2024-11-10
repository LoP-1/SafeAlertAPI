package com.apiSafeAlert.SafeAlert.Repository;

import com.apiSafeAlert.SafeAlert.model.Marker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Marker,Long > {
}
