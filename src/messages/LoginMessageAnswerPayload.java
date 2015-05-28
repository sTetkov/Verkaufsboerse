package messages;

import DBClasses.User;

public class LoginMessageAnswerPayload {
	private boolean loginSuccess;
	private User userData;

	public User getUserData() {
		return userData;
	}

	public void setUserData(User userData) {
		this.userData = userData;
	}

	public boolean isLoginSucces() {
		return loginSuccess;
	}

	public void setLoginSucces(boolean loginSuccess) {
		this.loginSuccess = loginSuccess;
	}

	public LoginMessageAnswerPayload(boolean loginSuccess, String msg) {
		this.loginSuccess = loginSuccess;
		this.failureReason = msg;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	private String failureReason;
}
