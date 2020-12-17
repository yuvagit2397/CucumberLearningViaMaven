package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;

public class GetdataFromFeature {
	

@Given("count is {int}")
public void count_is(Integer intNo) {
    int count=10;
    count=count+intNo;
    System.out.println(count);
    
}

@Given("percentage is {double}")
public void percentage_is(Double doubleNo) {
	System.out.println("percentage= "+doubleNo);
}

/*@Given("string value is {string}")
public void string_value_is(String string) {
	System.out.println("name= "+string);
}*/

/*@Given("string value is {string} and {string}")
public void string_value_is_and(String string, String string2) {
	System.out.println("the first name is= "+string);
	System.out.println("anthor name is="+string2);
}
*/
@Given("string value is {string} and {string}")
public void string_value_is_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
	System.out.println(asMap.values());

}
	

}
