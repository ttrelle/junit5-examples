package junit5.mockito;

class Multiplizierer {

    Addierer addierer;

    Multiplizierer(Addierer addierer) {
        this.addierer = addierer;
    }

    int multipliziere(int a, int b) {
        int result = 0;

        for (int i = 0; i < a; i++) {
            result = addierer.addiere(result, b);
        }

        return result;
    }

}
