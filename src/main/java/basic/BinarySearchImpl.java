package basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	@Autowired
	@Qualifier("quick")
	private SorteAlgorithm sortAlgorithm;
	
//	public void setSortAlgorithm(SorteAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public BinarySearchImpl(SorteAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySeach(int [] numbers, int position){
		int [] sortedNumebers = sortAlgorithm.sortNumebers(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

}
