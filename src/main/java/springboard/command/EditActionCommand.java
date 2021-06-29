package springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springboard.model.JDBCTemplateDAO;
import springboard.model.SpringBbsDTO;

@Service
public class EditActionCommand implements BbsCommandImpl{

	@Autowired
	JDBCTemplateDAO dao;
	
	@Override
	public void execute(Model model) {
		
		// 커맨드객체를 통해 모든 폼값을 저장한 DTO를 가져온다.
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("req");
		
		SpringBbsDTO springBbsDTO =
				(SpringBbsDTO)map.get("springBbsDTO");
				
		//JDBCTemplateDAO dao = new JDBCTemplateDAO();
		
		dao.edit(springBbsDTO);
	}
}
