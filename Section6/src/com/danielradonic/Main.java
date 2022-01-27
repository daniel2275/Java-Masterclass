package com.danielradonic;

public class Main {

    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        BankAccount myAccount = new BankAccount();
//
//        myAccount.setAccountNumber(234534);
//        myAccount.setBalance(830000);
//        myAccount.setCustomerName("John Smith");
//        myAccount.setEmail("JohnSmith@gmail.com");
//        myAccount.setPhoneNumber("11-2343-2312");
//
//        System.out.println("Account number : " + myAccount.getAccountNumber());
//        System.out.println("Account Name   : " + myAccount.getCustomerName());
//        System.out.println("Account Email  : " + myAccount.getEmail());
//        System.out.println("Account Phone  : " + myAccount.getPhoneNumber());
//        System.out.println("Account balance: " + myAccount.getBalance());
//        System.out.println();
//        myAccount.deposit(10000);
//        System.out.println();
//        myAccount.withdraw(15000);

//        VipCustomer boss = new VipCustomer();
//        System.out.println(boss.getCreditLimit());
//
//        VipCustomer daniel = new VipCustomer("Daniel", 200000);
//        System.out.println(daniel.getCreditLimit());
//
//        VipCustomer customer1 = new VipCustomer("Daniel", 800000, "Daniel@gmail.com");
//        System.out.println(customer1.getCreditLimit());

//         Wall wall = new Wall(5,4);
//         System.out.println("area= " + wall.getArea());
//
//         wall.setHeight(-1.5);
//         System.out.println("width= " + wall.getWidth());
//         System.out.println("height= " + wall.getHeight());
//         System.out.println("area= " + wall.getArea());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Vehicle myCar = new Vehicle("Mazda", 4, 1, 0);

//        Suv myCar = new Suv("Mazda", 4, "Petrol", "Astina");
//        System.out.println(myCar.getSpeed());
//
//        myCar.setSpeed(199);
//        System.out.println(myCar.getSpeed());
//
//        myCar.setSpeed(180);
//        System.out.println(myCar.getSpeed());
//
//        System.out.println(myCar.getGear());
//        myCar.setGear(6);
//        System.out.println(myCar.getGear());
//
//        myCar.setGear(1);
//        System.out.println(myCar.getGear());
//
//        System.out.println(myCar.getSteer());
//        myCar.setSteer(90);
//        System.out.println(myCar.getSteer());

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(5,10,5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());

//        Walls wall = new Walls(10,2.5,"White");
//        Door door = new Door(0.8, 1.8, "Pre-hung");
//        Window window = new Window(2, 1, "Double-hung");
//        NightStand nightStand = new NightStand("left", new Illumination("Lamp"));
//        Bed bed = new Bed(3.5, "King");
//
//        Room room = new Room(wall,door,window,bed,nightStand);
//
//        room.getNightStand().getLamp().switchOnOff();
//        room.getNightStand().getLamp().switchOnOff();
//
//        room.openCloseDoor();
//        room.openCloseDoor();
//
//        room.openCloseWindow();
//        room.openCloseWindow();
//
//        room.switchNightStandLight();


    }
}