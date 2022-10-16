import java.util.HashMap;

abstract class dga extends ampas {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<Integer, String> director = new HashMap<Integer, String>();

        // Add keys and values (Name, Year)
        director.put(1948, "Joseph L. Mankiewicz");
        director.put(1949, "Robert Rossen");
        director.put(1950, "Joseph L. Mankiewicz");
        director.put(1951, "George Stevens");
        director.put(1952, "John Ford");
        director.put(1953, "Fred Zinnemann");
        director.put(1954, "Elia Kazan");
        director.put(1955, "Delbert Mann");
        director.put(1956, "George Stevens");
        director.put(1957, "David Lean");
        director.put(1958, "Vincente Minnelli");
        director.put(1959, "William Wyler");
        director.put(1960, "Billy Wilder");
        director.put(1961, "Robert Wise and Jerome Robbins");
        director.put(1962, "David Lean");
        director.put(1963, "Tony Richardson");
        director.put(1964, "George Cukor");
        director.put(1965, "Robert Wise");
        director.put(1966, "Fred Zinnemann");
        director.put(1967, "Mike Nichols");
        director.put(1968, "Anthony Harvey");
        director.put(1969, "John Schlesinger");
        director.put(1970, "Franklin J. Schaffner");
        director.put(1971, "William Friedkin");
        director.put(1972, "Francis Ford Coppola");
        director.put(1973, "George Roy Hill");
        director.put(1974, "Francis Ford Coppola");
        director.put(1975, "Milos Forman");
        director.put(1976, "John G. Avildsen");
        director.put(1977, "Woody Allen");
        director.put(1978, "Michael Cimino");
        director.put(1979, "Robert Benton");
        director.put(1980, "Robert Redford");
        director.put(1981, "Warren Beatty");
        director.put(1982, "Richard Attenborough");
        director.put(1983, "James L. Brooks");
        director.put(1984, "Milos Forman");
        director.put(1985, "Steven Spielberg");
        director.put(1986, "Oliver Stone");
        director.put(1987, "Bernardo Bertolucci");
        director.put(1988, "Barry Levinson");
        director.put(1989, "Oliver Stone");
        director.put(1990, "Kevin Costner");
        director.put(1991, "Jonathan Demme");
        director.put(1992, "Clint Eastwood");
        director.put(1993, "Steven Spielberg");
        director.put(1994, "Robert Zemeckis");
        director.put(1995, "Ron Howard");
        director.put(1996, "Anthony Minghella");
        director.put(1997, "James Cameron");
        director.put(1998, "Sam Mendes");
        director.put(1999, "Sam Mendes");
        director.put(2000, "Ang Lee");
        director.put(2001, "Ron Howard");
        director.put(2002, "Rob Marshall");
        director.put(2003, "Peter Jackson");
        director.put(2004, "Clint Eastwood");
        director.put(2005, "Ang Lee");
        director.put(2006, "Martin Scorsese");
        director.put(2007, "Joel Coen and Ethan Coen");
        director.put(2008, "Danny Boyle");
        director.put(2009, "Kathryn Bigelow");
        director.put(2010, "Tom Hooper");
        director.put(2011, "Michel Hazanavicius");
        director.put(2012, "Ben Affleck");
        director.put(2013, "Alfonso Cuarón");
        director.put(2014, "Alejandro G. Iñárritu");
        director.put(2015, "Alejandro G. Iñárritu");
        director.put(2016, "Damien Chazelle");
        director.put(2017, "Guillermo del Toro");
        director.put(2018, "Alfonso Cuarón");
        director.put(2019, "Sam Mendes");
        director.put(2020, "Chloé Zhao");
        director.put(2021, "Jane Campion");

        for (Integer i : director.keySet()) {
            System.out.println("The DGA Award for Outstanding Directorial Achievement in Motion Pictures in " + i
                    + " went to " + director.get(i) + "." + System.lineSeparator());
        }
    }
}