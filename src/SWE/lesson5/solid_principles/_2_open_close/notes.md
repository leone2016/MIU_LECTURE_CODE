In the bad example, the DiscountCalculatorService class violates OCP. Every time a new product type with a different discount rule is introduced, we have to modify the calculateDiscountedPrice method. This means opening up an existing, potentially tested, class for modification, which can lead to bugs and make the system harder to maintain.

To adhere to OCP, we can use an interface to define the contract for discount calculation and then create separate implementations for each discount type.

In the good example:

1. DiscountStrategy Interface: We define an interface that outlines the contract for applying a discount.

2. Concrete Strategy Classes: Each specific discount rule (e.g., RegularPriceStrategy, TenPercentDiscountStrategy, TwentyPercentDiscountStrategy, FiftyPercentDiscountStrategy) is encapsulated in its own class, implementing the DiscountStrategy interface.

3. Product Class: The Product class no longer has conditional logic based on product type. Instead, it takes an instance of DiscountStrategy in its constructor (or through a setter) and delegates the discount calculation to it.

Now, if a new discount type (e.g., "clearance") is introduced, we simply:

- Create a new class (e.g., FiftyPercentDiscountStrategy) that implements the DiscountStrategy interface.

- Instantiate Product with this new strategy.

We don't need to modify the ProductV2 class or any of the existing discount strategy classes. This demonstrates the Open/Closed Principle: the system is open for extension (you can add new discount strategies) but closed for modification (you don't change existing, tested code).
