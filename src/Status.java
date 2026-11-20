public enum Status {
    REGISTERED("Registered"),
    ADMITTED("Admitted"),
    WAITLISTED("Waitlisted"),
    REJECTED("Rejected");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    @Override 
    public String toString() {
        return description;
    }
}
