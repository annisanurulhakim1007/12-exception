public class Customer  {
    private String namaCustomer;

    public Customer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    @Override
    public String toString() {
        return "Nama Customer: " + namaCustomer;
    }
}