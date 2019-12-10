package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Fibunacci extends AbstractOperation implements BinaryOperation
{

    @Override
    public String getName()
    {
        return "Fib";
    }

    @Override
    public float perform(float arg1, float arg2)
    {
        int start = Float.valueOf(arg1).intValue();
        int anz =  Float.valueOf(arg1).intValue();
        if(anz < 1)
            return 0;
        int sum = start;
        for(int i = 1; i < anz;i++)
        {
            start++;
            sum += start;
        }
        return sum;
    }

}
