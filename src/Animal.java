public class Animal {
    // properties : thuộc tính hiển thị thông tin đối tượng
    float weight;
    float height;
    boolean isHerbivore;

    // constructor: phương thức khởi tạo
    public Animal(float weight, float height, boolean isHerbivore){
        this.weight = weight;
        this.height =  height;
        this.isHerbivore = isHerbivore;
    }

    // function : hành vi
    public void eat() {
        if (isHerbivore){
            System.out.println("Động vật ăn cỏ");
        } else {
            System.out.println("Động vật ăn thit");
        }
    }
}
