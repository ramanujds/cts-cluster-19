package model;

public non-sealed class Developer extends Employee{

    private String language;

    public Developer() {
    }

    public Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        this.language = language;
    }

    public void printDetails() {
        System.out.println("Developer Details : ");
        System.out.println("Language : "+language);
        super.printDetails();
    }
}
