package dev.m_pluse.com.dto;

import dev.m_pluse.com.entity.Position;
import dev.m_pluse.com.entity.ResourceType;

public class PositionDTO {

	public String position(Position position) {

		switch (position) {
		case ROLE_ONE_OF_BOSS:
			return "BIG BOSS";
		case ROLE_MANAGER:
			return "Manager";
		case ROLE_TECHLEAD:
			return "Techlead";
		case ROLE_TEAMLEAD:
			return "Teamlead";
		case ROLE_SENIOR:
			return "Senior";
		case ROLE_MIDDLE:
			return "Middle";
		case ROLE_JUNIOR:
			return "Junior";
		case ROLE_TRAINEE:
			return "Trainee";

		default:
			break;
		}

		return null;
	}

	public Position getPosition(String position) {

		switch (position) {
		case "BIG BOSS":
			return Position.ROLE_ONE_OF_BOSS;
		case "Manager":
			return Position.ROLE_MANAGER;
		case "Techlead":
			return Position.ROLE_TECHLEAD;
		case "Teamlead":
			return Position.ROLE_TEAMLEAD;
		case "Senior":
			return Position.ROLE_SENIOR;
		case "Middle":
			return Position.ROLE_MIDDLE;
		case "Junior":
			return Position.ROLE_JUNIOR;
		case "Trainee":
			return Position.ROLE_TRAINEE;

		default:
			break;
		}

		return null;

	}

	public String resourceType(ResourceType resourceType) {

		switch (resourceType) {
		case DECELOPER_RESOURCE:
			return "Developer resource";
		case DEVELOPER_AUDIO:
			return "Developer audio";
		case DEVELOPER_IMG:
			return "Developer img";
		case DEVELOPER_VIDOE:
			return "Developer video";
		case PROJECT_RESOURCE:
			return "Project resources";
		case PROJECT_RESOURCE_GITHUB:
			return "Project resources from Gitub";
		case SESSION_DATA:
			return "Session data";
		case SESSION_REPORT:
			return "Session report";

		default:
			break;
		}

		return null;
	}
	public ResourceType getResourceType(String resourcesType) {

		switch (resourcesType) {
		case "Developer resource":
			return ResourceType.DECELOPER_RESOURCE;
		case "Developer audio":
			return ResourceType.DEVELOPER_AUDIO;
		case "Developer img":
			return ResourceType.DEVELOPER_IMG;
		case "Developer video":
			return ResourceType.DEVELOPER_VIDOE;
		case "Project resources":
			return ResourceType.PROJECT_RESOURCE;
		case "Project resources from Gitub":
			return ResourceType.PROJECT_RESOURCE_GITHUB;
		case "Session data":
			return ResourceType.SESSION_DATA;
		case "Session report":
			return ResourceType.SESSION_REPORT;

		default:
			break;
		}

		return null;

	}	

}
