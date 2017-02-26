package staticInnerClass;

import staticInnerClass.ArrayAlg.Pair;

public class Change
{
   public static void main(String[] args)
   {
      double[] d = new double[20];
      for (int i = 0; i < d.length; i++)
         d[i] = 100 * Math.random();
      ArrayAlg2.Pair p = ArrayAlg2.minmax(d);
      System.out.println("min = " + p.getFirst());
      System.out.println("max = " + p.getSecond());
   }
}

class ArrayAlg2
{
 
   public class Pair
   {
      private double first;
      private double second;

      public Pair(double f, double s)
      {
         first = f;
         second = s;
      }

      public double getFirst()
      {
         return first;
      }

      public double getSecond()
      {
         return second;
      }
   }

   public static Pair minmax(double[] values)
   {
      double min = Double.MAX_VALUE;
      double max = Double.MIN_VALUE;
      for (double v : values)
      {
         if (min > v) min = v;
         if (max < v) max = v;
      }
      return new ArrayAlg2().new Pair(min, max);
   }
}
