    package hu.gde.runnersdemo;

    import jakarta.persistence.*;
    import java.util.ArrayList;
    import java.util.List;

    @Entity
    public class RunnerEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long runnerId;
        private String runnerName;
        private long averagePace;
        private int shoesize;

        @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<LapTimeEntity> laptimes = new ArrayList<>();

        @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<ShoeNameEntity> shoeNames = new ArrayList<>();


        public RunnerEntity() {
        }

        public long getRunnerId() {
            return runnerId;
        }

        public String getRunnerName() {
            return runnerName;
        }

        public long getAveragePace() {
            return averagePace;
        }

        public int getShoesize() { return shoesize; }

        public String getRunnerNameOnly() {
            return runnerName;
        }
        // setterek

        public void setRunnerId(long runnerId) {
            this.runnerId = runnerId;
        }

        public void setRunnerName(String runnerName) {
            this.runnerName = runnerName;
        }

        public void setAveragePace(long averagePace) {
            this.averagePace = averagePace;
        }

        public void setShoesize(int shoesize) {
            this.shoesize = shoesize;
        }

        public List<LapTimeEntity> getLaptimes() {
            return laptimes;
        }

        public List<ShoeNameEntity> getShoeNames() { return shoeNames;
        }
        public void setShoeNames(List<ShoeNameEntity> shoeNames) {
            this.shoeNames = shoeNames;
        }

    }
