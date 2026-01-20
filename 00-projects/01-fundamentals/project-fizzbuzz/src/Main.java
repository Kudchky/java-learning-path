void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Number: ");
    int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            IO.println("FIZZBUZZ");
        else if (number % 5 == 0)
            IO.println("FIZZ");
        else if(number % 3 == 0)
            IO.println("BUZZ");
        else
            IO.println(number);
}

