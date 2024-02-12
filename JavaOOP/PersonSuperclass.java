public class PersonSuperclass {
    private String name;
    private String icno;
    private String hpno;
    private String address;

    public PersonSuperclass(String name, String icno, String hpno, String address) {
        this.name = name;
        this.icno = icno;
        this.hpno = hpno;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIcno() {
        return icno;
    }

    public String getHpno() {
        return hpno;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public void setHpno(String hpno) {
        this.hpno = hpno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Display() {
        System.out.println("Name    \t:" + name);
        System.out.println("Ic no   \t:" + icno);
        System.out.println("HP no   \t:" + hpno);
        System.out.println("Address \t:" + address);
    }

}
