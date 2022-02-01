package nextstep.subway.exception;

import nextstep.subway.ui.ExceptionMessage;

public class NotFoundException extends NullPointerException {
	public NotFoundException() {
		super(ExceptionMessage.DEFAULT_MESSAGE.getMessage());
	}

	public NotFoundException(String message) {
		super(message);
	}
}
