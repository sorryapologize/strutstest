package cn.itcast;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		LoginForm loginForm = (LoginForm) form;
		if(loginForm.getUsername().equals("itcast")){
			return mapping.findForward("LoginSuccess");
			
			
		}else{
			
			return mapping.findForward("LoginFailure");
		}
		
		
	}

}
