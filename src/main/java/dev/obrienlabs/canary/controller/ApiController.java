
// limitations under the License.
package dev.obrienlabs.canary.controller;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.obrienlabs.canary.service.ApplicationServiceLocal;

// change to RestController
@Controller
@RequestMapping("/api")
// http://localhost:8080/nbi/api
public class ApiController {
	
	private final static Logger LOG = Logger.getLogger(ApiController.class.getName());
	
	@Autowired
	ApplicationServiceLocal applicationService;
	

	
    private static AtomicLong nextSessionId = new AtomicLong(1);
    //private Map<Long, AtomicLong> lastTimestampMap = new ConcurrentHashMap<>();
    //private Map<Long, AtomicLong> nextReadingSequenceIdMap = new ConcurrentHashMap<>();
    private static AtomicLong nextReadingSequenceId = new AtomicLong(1);

    private final AtomicLong counter = new AtomicLong();
	private static final CharSequence PASS = ""; // OK
	
	@GetMapping(value = "/activeId", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/activeId", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String activeId() {//HttpServletRequest request) {
        //String user = request.getParameter("u");        
        StringBuffer xmlBuffer = new StringBuffer();
        // check local cache first
        String activeId = "2025";//applicationService.activeId();//null;
        // make sure the content type is application/json on the response header
        xmlBuffer.append("{\"id\" : ").append(activeId).append(" }");
        //xmlBuffer.append(activeId);
        return xmlBuffer.toString(); 
    }
  
	@GetMapping("/health")
	@RequestMapping("/health")
	public @ResponseBody String getHealth() {
		return applicationService.health().toString();
	}
}
