package com.Rebeca.ds.ChicagoAnalysis;
public class worker extends Person {

    protected String department;
    protected String jobTitle;
    protected boolean isPartTime;
    protected boolean isHourly;
    protected int typicalAmountOfHours;
    protected double annualSalary;
    protected double hourlyRate;

    public worker(final String name,
                  final String lastname,
                  final String jobTitle,
                  final String department,
                  final String isPartTime,
                  final String isHourly,
                  final String typicalAmountOfHours,
                  final String annualSalary,
                  final String hourlyRate) {

        super(name, lastname);
        this.jobTitle = jobTitle;
        this.department = department;
        this.isPartTime = this.parsePartTimeInput(isPartTime);
        this.isHourly = this.parseIsHourlyInput(isHourly);
        this.typicalAmountOfHours = this.parseTypicalAmountOfHoursInput(typicalAmountOfHours);
        this.annualSalary = this.parseAnnualSalaryInput(annualSalary);
        this.hourlyRate = this.parseHourlyRateInput(hourlyRate);
        this.computeAnnualSalaryForHourlyRate();
    }

    private void computeAnnualSalaryForHourlyRate(){
        if(this.isHourly){
            this.annualSalary = this.typicalAmountOfHours * 52 * this.hourlyRate;
        }
    }


    private boolean parseIsHourlyInput(String isHourlyColumnData){
        boolean isHourly = false;
        if(isHourlyColumnData.compareTo("Hourly") == 0){
            isHourly = true;
        }
        return isHourly;
    }

    private int parseTypicalAmountOfHoursInput(String typicalAmountOfHoursColumnData){
        int typicalAmountOfHours = 0;
        if(!typicalAmountOfHoursColumnData.isEmpty()){
            try {
                typicalAmountOfHours = Integer.parseInt(typicalAmountOfHoursColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(typicalAmountOfHoursColumnData + " is not a valid number");
                exc.printStackTrace();
            }
        }
        return typicalAmountOfHours;
    }


    private double parseAnnualSalaryInput(String annualSalaryColumnData){
        double annualSalary = 0.0;
        if(!annualSalaryColumnData.isEmpty()){
            try {
                annualSalary = Double.parseDouble(annualSalaryColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(annualSalaryColumnData + " is not a valid double");
                exc.printStackTrace();
            }
        }
        return annualSalary;
    }


    private double parseHourlyRateInput(String hourlyRateColumnData){
        double hourlyRateInput = 0.0;
        if(hourlyRateColumnData.compareTo(" ") != 0){
            try {
                hourlyRateInput = Double.parseDouble(hourlyRateColumnData);
            }
            catch (NumberFormatException exc){
                System.out.println(hourlyRateColumnData + " is not a valid double");
                exc.printStackTrace();
            }
        }
        return hourlyRateInput;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", isPartTime=" + isPartTime +
                ", isHourly=" + isHourly +
                ", typicalAmountOfHours=" + typicalAmountOfHours +
                ", annualSalary=" + annualSalary +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    private boolean parsePartTimeInput(String partTimeColumnData){
        boolean isPartTime = false;
        if(partTimeColumnData.compareTo("P") == 0){
            isPartTime = true;
        }
        return isPartTime;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public int getTypicalAmountOfHours() {
        return typicalAmountOfHours;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

}
