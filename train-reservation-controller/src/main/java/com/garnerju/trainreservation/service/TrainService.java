package com.garnerju.trainreservation.service;

import com.garnerju.trainreservation.model.Train;
import com.garnerju.trainreservation.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TrainService {

    @Autowired
    TrainRepository repo;

    public List<Train> getAllTrain() {
        return repo.findAll();
    }

    public Train createTrain(Train newTrain) {
        return repo.save(newTrain);
    }

    public Train getTrainById(int id) {
        Optional<Train> train = repo.findById(id);
        return train.orElse(null);
    }

    public void updateTrain(Train train) {
        repo.save(train);
    }


    public void deleteTrain(int id) {
        Optional<Train> train = repo.findById(id);
        train.ifPresent(value -> repo.delete(value));
    }
}
