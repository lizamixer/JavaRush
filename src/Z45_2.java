    public class Z45_2 {
        public String firstName;
        public String lastName;

        public Z45_2(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        protected String getFirstName() {
            return firstName;
        }

        String getLastName() {
            return lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
