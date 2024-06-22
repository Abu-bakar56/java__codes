class NumberException extends Exception {
    @Override
    public String getMessage() {
        return "Number is greater than 200";
    }
}

class MM {
    void mm1() throws NumberException {
        int num = 210;
        if (num > 200) {
            throw new NumberException();
        } else {
            System.out.println(num);
        }

    }
}

class Finalpractice2 {
    public static void main(String[] args) {
        MM m = new MM();

        try {
            m.mm1();
        } catch (NumberException e) {
            System.out.println( e.getMessage());
        }
        


    }
}
