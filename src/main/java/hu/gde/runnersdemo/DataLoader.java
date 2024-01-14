package hu.gde.runnersdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final RunnerRepository runnerRepository;

    @Autowired
    public DataLoader(RunnerRepository runnerRepository) {
        this.runnerRepository = runnerRepository;
    }

    @Override
    public void run(String... args) {
        // create default runner entity
        RunnerEntity runnerEntity = new RunnerEntity();
        runnerEntity.setRunnerName("Tomi");
        runnerEntity.setAveragePace(310);
        runnerEntity.setShoesize(43);

        // create default laptime entities and add them to the runner entity
        LapTimeEntity laptime1 = new LapTimeEntity();
        laptime1.setLapNumber(1);
        laptime1.setTimeSeconds(120);
        laptime1.setRunner(runnerEntity);

        LapTimeEntity laptime2 = new LapTimeEntity();
        laptime2.setLapNumber(2);
        laptime2.setTimeSeconds(110);
        laptime2.setRunner(runnerEntity);

        runnerEntity.getLaptimes().add(laptime1);
        runnerEntity.getLaptimes().add(laptime2);

        ShoeNameEntity shoeName1 = new ShoeNameEntity();
        shoeName1.setShoeName("Nike");
        shoeName1.setRunner(runnerEntity);
        runnerEntity.getShoeNames().add(shoeName1);

        runnerRepository.save(runnerEntity);

        RunnerEntity runnerEntity2 = new RunnerEntity();
        runnerEntity2.setRunnerName("Zsuzsi");
        runnerEntity2.setAveragePace(290);
        runnerEntity2.setShoesize(38);

        // create default laptime entities and add them to the runner entity
        LapTimeEntity laptime3 = new LapTimeEntity();
        laptime3.setLapNumber(1);
        laptime3.setTimeSeconds(95);
        laptime3.setRunner(runnerEntity2);

        LapTimeEntity laptime4 = new LapTimeEntity();
        laptime4.setLapNumber(2);
        laptime4.setTimeSeconds(100);
        laptime4.setRunner(runnerEntity2);

        runnerEntity2.getLaptimes().add(laptime3);
        runnerEntity2.getLaptimes().add(laptime4);

        ShoeNameEntity shoeName2 = new ShoeNameEntity();
        shoeName2.setShoeName("Adidas");
        shoeName2.setRunner(runnerEntity2);
        runnerEntity2.getShoeNames().add(shoeName2);

        runnerRepository.save(runnerEntity2);


        RunnerEntity runnerEntity3 = new RunnerEntity();
        runnerEntity3.setRunnerName("Joli");
        runnerEntity3.setAveragePace(275);
        runnerEntity3.setShoesize(37);

        // create default laptime entities and add them to the runner entity
        LapTimeEntity laptime5 = new LapTimeEntity();
        laptime5.setLapNumber(1);
        laptime5.setTimeSeconds(92);
        laptime5.setRunner(runnerEntity3);

        LapTimeEntity laptime6 = new LapTimeEntity();
        laptime6.setLapNumber(2);
        laptime6.setTimeSeconds(98);
        laptime6.setRunner(runnerEntity3);

        runnerEntity3.getLaptimes().add(laptime5);
        runnerEntity3.getLaptimes().add(laptime6);

        ShoeNameEntity shoeName3 = new ShoeNameEntity();
        shoeName3.setShoeName("Fila");
        shoeName3.setRunner(runnerEntity3);
        runnerEntity3.getShoeNames().add(shoeName3);

        runnerRepository.save(runnerEntity3);
    }
}

