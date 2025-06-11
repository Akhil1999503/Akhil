public class Main {
    public static void main(String[] args) {

        // 1. Swap 2 numbers using temp
        {
            int var1 = 10, var2 = 20;
            int temp = var1;
            var1 = var2;
            var2 = temp;
            System.out.println("as-1 : afterswap: var1 = " + var1 + ", var2 = " + var2);
        }

        // 2. Swap 2 numbers without temp
        {
            int var1 = 10, var2 = 20;
            var1 = var1 + var2;
            var2 = var1 - var2;
            var1 = var1 - var2;
            System.out.println("as-2: afterswap: var1 = " + var1 + ", var2 = " + var2);
        }

        // 3: Swap 3 numbers using temp
        {
            int var1 = 10, var2 = 20, var3 = 30;
            int temp = var1;
            var1 = var2;
            var2 = var3;
            var3 = temp;
            System.out.println("as-3 : afterswap: var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3);
        }

        // 4 . Swap 3 numbers without temp
        {
            int var1 = 10, var2 = 20, var3 = 30;
            var1 = var1 + var2 + var3;
            var2 = var1 - (var2 + var3);
            var3 = var1 - (var2 + var3);
            var1 = var1 - (var2 + var3);
            System.out.println("as-4 : afterswap: var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3);
        }

        // 5th : Swap 4 num using temp
        {
            int var1 = 1, var2 = 2, var3 = 3, var4 = 4;
            int temp = var1;
            var1 = var2;
            var2 = var3;
            var3 = var4;
            var4 = temp;
            System.out.println("as-5 : afterswap: var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + ", var4 = " + var4);
        }

        // 6th : swap 4 wthout temp
        {
            int var1 = 1, var2 = 2, var3 = 3, var4 = 4;
            int temp = var1;
            var1 = var1 + var2 + var3 + var4;
            var2 = var1 - (var2 + var3 + var4);
            var3 = var1 - (var2 + var3 + var4);
            var4 = var1 - (var2 + var3 + var4);
            var1 = var1 - (var2 + var3 + var4);
            System.out.println("as-6: After swap: var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + ", var4 = " + var4);
        }

        // 7th : JioFiber final cost
        {
            double plancost = 699;
            double gstPercent = 18;
            double gstAmount = (plancost * gstPercent) / 100;
            double finalPrice = plancost + gstAmount;
            System.out.println("as-7: JioFiber Final Cost = " + finalPrice);
        }

        // 8th : sampath dominos
        {
            int pizzaCount = 2;
            int pricePerPizza = 399;
            int totalAmount = pizzaCount * pricePerPizza;

            double discountPercent = 10;
            double discountAmount = (totalAmount * discountPercent) / 100;
            double finalAmount = totalAmount - discountAmount;

            System.out.println("as-8: Final Bill Amount = " + finalAmount);
        }

        // 9th : vikram tax
        {
            double salary = 85000;
            double taxRate = 20;

            double taxAmount = (salary * taxRate) / 100;

            System.out.println("as-9: Tax Amount = " + taxAmount);
        }

        // 10 th : final amount of sarath
        {
            double principal = 500000;
            double rate = 6.8;
            double time = 5;

            double interest = (principal * rate * time) / 100;
            double finalAmount = principal + interest;

            System.out.println("as-10: Interest Amount = " + interest);
            System.out.println("as-10: Final Amount = " + finalAmount);
        }

    }
}
