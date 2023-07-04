package in.pradeep.rest;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.pradeep.binding.PassengerInfo;
import in.pradeep.binding.TickerInfo;

@RestController

public class TicketRestController {
	@PostMapping(value="/ticket", consumes= {"application/json"} ,produces= {"application/json"})
	public ResponseEntity<TickerInfo> bookticket(@RequestBody PassengerInfo info){
		System.out.println(info);
		TickerInfo tickerInfo=new TickerInfo();
		tickerInfo.setTicketId(111);
		tickerInfo.setPNR("A1233");
		tickerInfo.setTicketstatus("CNF");
	  return new ResponseEntity<>(tickerInfo,HttpStatus.CREATED); 
		//return new ResponseEntity<>();
		
	}
	@PutMapping("/ticket")
	public ResponseEntity<String> Updateticket(@RequestBody PassengerInfo info){
		System.out.println(info);
		return new ResponseEntity<String>("ticket update",HttpStatus.OK);
		
	}
	@DeleteMapping("/ticket/{TicketId}" )
	public ResponseEntity<String> Deleteticket(@PathVariable("TicketId" )Integer TicketId){
		String mm=TicketId+"=deleted";
		return new ResponseEntity<String>(mm,HttpStatus.OK);
		
	}
}
