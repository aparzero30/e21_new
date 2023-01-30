import junit.framework.Assert;
import org.example.AdvanceMath;
import org.example.BasicMath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AdvanceMathTester {

    @InjectMocks
    AdvanceMath advanceMath = new AdvanceMath();

    @Mock
    BasicMath basicMath;



   //TEST1
    @Test
    public void  testMultiplyDifferenceBy5(){

        when(basicMath.subtract(80.0,20.0)).thenReturn((60.0));
        when(basicMath.multiply(60.0,5.0)).thenReturn((300.0));
        Assert.assertEquals(advanceMath.multiplyDifferenceBy5(80.0,20.0), 300.0, 0);
        verify(basicMath).subtract(80.0,20.0);
        verify(basicMath).multiply(60.0,5.0);

    }



   //TEST2

    @Test
    public void  testMultiplySumBy5(){
        when(basicMath.add(75.0,25.0)).thenReturn((100.0));
        when(basicMath.multiply(100.0,5.0)).thenReturn((500.0));
        Assert.assertEquals(advanceMath.multiplySumBy5(75.0,25.0), 500.0, 0);
        verify(basicMath).add(75.0,25.0);
        verify(basicMath).multiply(100.0,5.0);
    }


    //TEST3
    @Test
    public void  testSquareOfSum(){

        when(basicMath.add(20.0,20.0)).thenReturn((40.0));
        when(basicMath.multiply(40.0,40.0)).thenReturn((1600.0));
        Assert.assertEquals(advanceMath.squareOfSum(20.0,20.0), 1600.0, 0);
        verify(basicMath, times(2)).add(20.0, 20.0);
        verify(basicMath, atLeast(2)).add(20.0, 20.0);
        verify(basicMath).multiply(40.0,40.0);


    }



    //TEST4
    @Test
    public void  testGetPercentage(){

        when(basicMath.divide(50.0,100.0)).thenReturn((0.5));
        when(basicMath.multiply(0.5,100.0)).thenReturn((50.0));
        Assert.assertEquals(advanceMath.getPercentage(50.0,100.0), 50.0, 0);
        verify(basicMath).divide(50.0,100.0);
        verify(basicMath).multiply(0.5,100.0);

         reset(basicMath);

        when(basicMath.divide(50.0,100.0)).thenReturn((0.5));
        when(basicMath.multiply(0.5,100.0)).thenReturn((50.0));
        Assert.assertEquals(advanceMath.getPercentage(50.0,100.0), 50.0, 0);
        verify(basicMath).divide(50.0,100.0);
        verify(basicMath).multiply(0.5,100.0);


    }




    //TEST5
    @Test
    public void  testMultiplyDifferenceBy5BDDFormat(){


        //given
        given(basicMath.subtract(80.0,20.0)).willReturn((60.0));
        given(basicMath.multiply(60.0,5.0)).willReturn((300.0));

        //when
        double result = advanceMath.multiplyDifferenceBy5(80.0,20.0);

        //then
        Assert.assertEquals(result, 300.0, 0);
        verify(basicMath).subtract(80.0,20.0);
        verify(basicMath).multiply(60.0,5.0);

    }


    //TEST6
    @Test
    public void  testMultiplySumBy5BDDFormat(){

        //given

        given(basicMath.add(75.0,25.0)).willReturn((100.0));
        given(basicMath.multiply(100.0,5.0)).willReturn((500.0));

        //when
        double result = advanceMath.multiplySumBy5(75.0,25.0);


        //then
        Assert.assertEquals( result , 500.0, 0);
        verify(basicMath).add(75.0,25.0);
        verify(basicMath).multiply(100.0,5.0);

    }


    //TEST7
    @Test
    public void  testSquareOfSumBDDFormat(){

        //given
        given(basicMath.add(20.0,20.0)).willReturn((40.0));
        given(basicMath.multiply(40.0,40.0)).willReturn((1600.0));

        //when
        double result = advanceMath.squareOfSum(20.0,20.0);

        //then
        Assert.assertEquals(result, 1600.0, 0);
        verify(basicMath, times(2)).add(20.0, 20.0);
        verify(basicMath, atLeast(2)).add(20.0, 20.0);
        verify(basicMath).multiply(40.0,40.0);

    }



    //TEST8
    @Test
    public void  testGetPercentageBDDFormat(){

        //given
        given(basicMath.divide(50.0,100.0)).willReturn((0.5));
        given(basicMath.multiply(0.5,100.0)).willReturn((50.0));

        //when
        double result = advanceMath.getPercentage(50.0,100.0);

       //then

        Assert.assertEquals(result, 50.0, 0);
        verify(basicMath).divide(50.0,100.0);
        verify(basicMath).multiply(0.5,100.0);


        reset(basicMath);

        //given
        given(basicMath.divide(50.0,100.0)).willReturn((0.5));
        given(basicMath.multiply(0.5,100.0)).willReturn((50.0));

        //when
        result = advanceMath.getPercentage(50.0,100.0);

        //then

        Assert.assertEquals(result, 50.0, 0);
        verify(basicMath).divide(50.0,100.0);
        verify(basicMath).multiply(0.5,100.0);



    }


}
