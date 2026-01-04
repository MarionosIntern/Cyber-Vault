package com.Transformer;

import com.Transformer.Transformer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransformerRepository extends JpaRepository<Transformer, Long> {
    List<Transformer> findByFaction(String faction);
    List<Transformer> findByContinuity(String continuity);
    List<Transformer> findByClassification(String classification);
    List<Transformer> findByName(String name);
}

