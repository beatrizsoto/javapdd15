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

public class YearExpression extends AbstractExpression
{

  @Override
  public void evaluate( Context context )
  {
    String expression = context.getExpression();
    Date date = context.getDate();
    Integer year = new Integer(date.getYear() + 1900);
    String tempExpression = expression.replaceAll("YYYY", year.toString());
    context.setExpression(tempExpression);
  }

}
