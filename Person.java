class Person {
    protected String name;
    protected String address;

    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
