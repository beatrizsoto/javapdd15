/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpattern;

/**
 *
 * @author fermin
 */import java.util.Date;

public class DayExpression extends AbstractExpression
{

  @Override
  public void evaluate( Context context )
  {
    String expression = context.getExpression();
    Date date = context.getDate();
    Integer day = new Integer(date.getDate());
    String tempExpression = expression.replaceAll("DD", day.toString());
    context.setExpression(tempExpression);
  }
}