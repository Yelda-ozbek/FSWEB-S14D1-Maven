package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[3];
        midDevelopers = new MidDeveloper[3];
        seniorDevelopers = new SeniorDeveloper[3];
    }

    @Override
    public void work() {
        setSalary(getSalary() + 5000);
        System.out.println("HR Manager is working. New salary: " + getSalary());
    }

    // Add Junior
    public void addEmployee(JuniorDeveloper junior) {
        addToArray(juniorDevelopers, junior);
    }

    // Add Mid
    public void addEmployee(MidDeveloper mid) {
        addToArray(midDevelopers, mid);
    }

    // Add Senior
    public void addEmployee(SeniorDeveloper senior) {
        addToArray(seniorDevelopers, senior);
    }

    private <T> void addToArray(T[] array, T item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                System.out.println(item.getClass().getSimpleName() + " eklendi.");
                return;
            }
        }
        System.out.println("Uyarı: " + item.getClass().getSimpleName() + " dizisi dolu, eklenemedi!");
    }
}
