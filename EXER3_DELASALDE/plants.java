public class plants{
    private String name;
    private String plantType;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public plants(String name, String plantType) {
        this.name = name;
        this.plantType = plantType;
    }

}