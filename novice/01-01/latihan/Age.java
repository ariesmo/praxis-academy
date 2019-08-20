public class Age {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        Age age = new Age();
        age.pupAge();
    }
}