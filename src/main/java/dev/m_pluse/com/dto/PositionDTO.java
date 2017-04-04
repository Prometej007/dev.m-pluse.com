package dev.m_pluse.com.dto;

import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.entity.ResourceType;

public class PositionDTO {

	public String position(Position position) {

		switch (position) {
		case ROLE_ONE_OF_BOSS:
			return "ROLE_ONE_OF_BOSS";
		case ROLE_MANAGER:
			return "ROLE_MANAGER";
		case ROLE_TECHLEAD:
			return "ROLE_TECHLEAD";
		case ROLE_TEAMLEAD:
			return "ROLE_TEAMLEAD";
		case ROLE_SENIOR:
			return "ROLE_SENIOR";
		case ROLE_MIDDLE:
			return "ROLE_MIDDLE";
		case ROLE_JUNIOR:
			return "ROLE_JUNIOR";
		case ROLE_TRAINEE:
			return "ROLE_TRAINEE";

		default:
			break;
		}

		return null;
	}

	public String resourceType(ResourceType resourceType) {

		switch (resourceType) {
		case DECELOPER_RESOURCE:
			return "DECELOPER_RESOURCE";
		case DEVELOPER_AUDIO:
			return "DEVELOPER_AUDIO";
		case DEVELOPER_IMG:
			return "DEVELOPER_IMG";
		case DEVELOPER_VIDOE:
			return "DEVELOPER_VIDOE";
		case PROJECT_RESOURCE:
			return "PROJECT_RESOURCE";
		case PROJECT_RESOURCE_GITHUB:
			return "PROJECT_RESOURCE_GITHUB";
		case SESSION_DATA:
			return "SESSION_DATA";
		case SESSION_REPORT:
			return "SESSION_REPORT";

		default:
			break;
		}

		return null;
	}

}
