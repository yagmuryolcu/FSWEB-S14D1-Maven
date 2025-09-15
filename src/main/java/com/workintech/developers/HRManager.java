package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    private int juniorIndex;
    private int midIndex;
    private int seniorIndex;


    public HRManager(int id, String name, double salary ) {
        super(id, name, salary);
        juniors= new JuniorDeveloper[5];
        mids= new MidDeveloper[8];
        seniors= new SeniorDeveloper[4];
        juniorIndex = 0;
        midIndex = 0;
        seniorIndex = 0;

    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }
    public MidDeveloper[] getMids(){
        return mids;
    }
    public SeniorDeveloper[] getSeniors(){
        return  seniors;
    }

    @Override
    public void work(){
        System.out.println("HR Manager is managing human resources");
        setSalary(getSalary() + 300);
    }


    public void addEmployee(JuniorDeveloper jd){

        if(juniors == null){
            System.out.println("Junior Developer array does not exist.");
            return;
        }

        if(juniorIndex < juniors.length) {
            juniors[juniorIndex++]=jd;
            System.out.println(jd.getName()+ "added as Junior Developer");
        }else {
            System.out.println("Cannot add more Junior Developers, array is full!");

        }
    }

    public void addEmployee(MidDeveloper md) {
        if(mids ==null) {
            System.out.println("Middle Developer array does not exist");
            return;
        }

        if (midIndex < mids.length){
            mids[midIndex++]=md;
            System.out.println(md.getName() +"added as Middle Developer");
        }else {
          System.out.println("Cannot add more Mid Developers, array is full!");
        }
    }

    public void addEmployee(SeniorDeveloper sd) {
        if (seniors == null) {
            System.out.println("Senior developers array does not exist!");
            return;
        }
        if (seniorIndex < seniors.length){
            seniors[seniorIndex++]=sd;
            System.out.println(sd.getName()+ "added as Senior Developer");
        }else {
            System.out.println("Cannot add more Senior Developers, array is full!");
        }
    }
    }
