package in.pradeep.Binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlRootElement
public class Student {

	private Integer Sid;
	private String Sname;
}
