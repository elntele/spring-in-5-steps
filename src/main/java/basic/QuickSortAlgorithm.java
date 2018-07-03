package basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
@Primary
public class QuickSortAlgorithm implements SorteAlgorithm {
	
	public int[] sortNumebers(int[] numbers){
		
		return numbers;
	}

}
