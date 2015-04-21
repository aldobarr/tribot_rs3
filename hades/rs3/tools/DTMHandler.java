package hades.rs3.tools;

import hades.rs3.LogType.Log;

import java.awt.Color;
import java.awt.Point;

import org.tribot.api.rs3.Skills;
import org.tribot.api.types.colour.ColourPoint;
import org.tribot.api.types.colour.DTM;
import org.tribot.api.types.colour.DTMPoint;
import org.tribot.api.types.colour.DTMSubPoint;
import org.tribot.api.types.colour.Tolerance;

public class DTMHandler{
	private static DTM loginButtonDTM;
	private static DTM unFieldFocused;
	private static DTM unFieldUnFocused;
	private static DTM playNowButtonDTM;
	private static DTM compassDTM;
	private static DTM tzhaarRingDTM;
	private static DTM magicSkillDTM;
	private static DTM prayerSkillDTM;
	private static DTM skillsMenuDTM;
	private static DTM heroMenuButtonDTM;
	private static DTM skillsMenuButtonDTM;
	private static DTM skillsMenuButtonOffDTM;
	private static DTM backPackMenuDTM;
	private static DTM gearMenuButtonDTM;
	private static DTM backPackMenuButtonDTM;
	private static DTM backPackMenuButtonOffDTM;
	private static DTM xpMenuDTM;
	private static DTM worldChatDTM;
	private static DTM logoutDTM;
	private static DTM lobbyDTM;
	private static DTM logoutButtonDTM;
	private static DTM fightCaveTeleButtonDTM;
	private static DTM bankCloseButtonDTM;
	private static DTM natDTM;
	private static DTM astralDTM;
	private static DTM plankSlotDTM[];
	private static DTM plainLogDTM[];
	
	// 174x28
	public static DTM getLoginButtonDTM(){
		if(loginButtonDTM != null)
			return loginButtonDTM;
		DTMPoint point = new DTMPoint(new Color(218, 171, 42), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(1, 20), new Color(187, 102, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(22, 11), new Color(252, 203, 74)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 26), new Color(191, 92, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(67, 26), new Color(255, 192, 130)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(49, 9), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(49, 20), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(56, 21), new Color(102, 74, 46)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(60, 13), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(73, 7), new Color(102, 86, 46)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(74, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(88, 6), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(80, 15), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(93, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(108, 18), new Color(135, 100, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(108, 9), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(120, 17), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(120, 7), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(142, 24), new Color(244, 137, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(151, 2), new Color(243, 200, 67)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(163, 21), new Color(215, 115, 10)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(171, 10), new Color(227, 168, 43)), new Tolerance(10, 10, 10), 1)};
		loginButtonDTM = new DTM(point, points);
		return loginButtonDTM;
	}
	
	// 244x20
	public static DTM getUnField(boolean focused){
		if(focused){
			if(unFieldFocused != null)
				return unFieldFocused;
			DTMPoint point = new DTMPoint(new Color(9, 37, 50), new Tolerance(10, 10, 10));
			DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(9, -16), new Color(255, 255, 255)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 51), new Color(153, 161, 164)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(239, 29), new Color(26, 24, 24)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(70, 2), new Color(9, 37, 50)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 14), new Color(9, 37, 50)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(48, 17), new Color(5, 19, 26)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(77, -27), new Color(1, 19, 27)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(28, 51), new Color(221, 224, 225)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(31, 54), new Color(255, 255, 255)), new Tolerance(10, 10, 10), 1)};
			unFieldFocused = new DTM(point, points);
			return unFieldFocused;
		}else{
			if(unFieldUnFocused != null)
				return unFieldUnFocused;
			DTMPoint point = new DTMPoint(new Color(9, 28, 37), new Tolerance(10, 10, 10));
			DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(9, -15), new Color(255, 255, 255)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, -13), new Color(255, 255, 255)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(38, -15), new Color(255, 255, 255)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 9), new Color(9, 28, 37)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(52, 7), new Color(9, 28, 37)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(240, 33), new Color(26, 24, 24)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 52), new Color(153, 161, 164)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 57), new Color(255, 255, 255)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 57), new Color(204, 208, 209)), new Tolerance(10, 10, 10), 1)};
			unFieldUnFocused = new DTM(point, points);
			return unFieldUnFocused;
		}
	}
	
	// 166x27
	public static DTM getPlayNowButtonDTM(){
		if(playNowButtonDTM != null)
			return playNowButtonDTM;
		DTMPoint point = new DTMPoint(new Color(155, 110, 34), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(5, 21), new Color(175, 92, 10)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 14), new Color(195, 122, 22)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 5), new Color(237, 199, 64)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(30, 12), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 17), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(34, 6), new Color(82, 62, 18)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(36, 11), new Color(1, 1, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(42, 7), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(42, 16), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(49, 18), new Color(55, 42, 16)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(53, 18), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(58, 8), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(63, 16), new Color(174, 128, 27)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(86, 11), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(86, 19), new Color(59, 49, 23)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(95, 16), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(97, 8), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(115, 13), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(157, 22), new Color(177, 109, 13)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(157, 4), new Color(236, 187, 72)), new Tolerance(10, 10, 10), 1)};
		playNowButtonDTM = new DTM(point, points);
		return playNowButtonDTM;
	}
	
	// 22x23
	public static DTM getCompassDTM(){
		if(compassDTM != null)
			return compassDTM;
		DTMPoint point = new DTMPoint(new Color(211, 166, 81), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(9, -17), new Color(74, 29, 8)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-10, 12), new Color(19, 34, 43)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(24, 20), new Color(139, 98, 21)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 27), new Color(52, 54, 42)), new Tolerance(10, 10, 10), 1)};
		compassDTM = new DTM(point, points);
		return compassDTM;
	}
	
	// 30x30
	public static DTM getTzhaarRingDTM(){
		if(tzhaarRingDTM != null)
			return tzhaarRingDTM;
		DTMPoint point = new DTMPoint(new Color(3, 6, 7), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(5, 11), new Color(165, 139, 93)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 15), new Color(196, 165, 110)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 17), new Color(196, 165, 110)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 19), new Color(120, 101, 68)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 21), new Color(130, 109, 73)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 19), new Color(217, 183, 122)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(25, 13), new Color(196, 165, 110)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 7), new Color(230, 194, 130)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 9), new Color(193, 162, 109)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 15), new Color(8, 12, 15)), new Tolerance(10, 10, 10), 1)};
		tzhaarRingDTM = new DTM(point, points);
		return tzhaarRingDTM;
	}
	
	// 54x22
	public static DTM getMagicSkillDTM(){
		if(magicSkillDTM != null)
			return magicSkillDTM;
		DTMPoint point = new DTMPoint(new Color(75, 75, 75), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(-2, 14), new Color(10, 25, 61)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, -2), new Color(45, 87, 173)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 3), new Color(60, 83, 132)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 14), new Color(98, 74, 111)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 17), new Color(56, 106, 205)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 12), new Color(167, 96, 66)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 12), new Color(173, 138, 62)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 11), new Color(225, 176, 30)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 13), new Color(194, 141, 95)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 15), new Color(21, 32, 37)), new Tolerance(10, 10, 10), 1)};
		magicSkillDTM = new DTM(point, points);
		return magicSkillDTM;
	}
	
	// 54x22
	public static DTM getPrayerSkillDTM(){
		if(prayerSkillDTM != null)
			return prayerSkillDTM;
		DTMPoint point = new DTMPoint(new Color(32, 32, 29), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(9, 9), new Color(251, 254, 254)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 13), new Color(96, 157, 191)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 9), new Color(155, 191, 210)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(2, 9), new Color(156, 191, 211)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 16), new Color(119, 173, 208)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 2), new Color(121, 161, 178)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 6), new Color(126, 169, 187)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 5), new Color(124, 135, 144)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 13), new Color(82, 98, 115)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 11), new Color(212, 226, 235)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 6), new Color(58, 104, 125)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 13), new Color(17, 27, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 16), new Color(26, 36, 42)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 2), new Color(58, 66, 69)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(1, 16), new Color(11, 17, 21)), new Tolerance(10, 10, 10), 1)};
		prayerSkillDTM = new DTM(point, points);
		return prayerSkillDTM;
	}
	
	/**
	 * Returns the DTM for the in game skill box which shows level information on the skills interface corresponding to that skill.
	 * @param skill The skill which you want a DTM for.
	 * @return The DTM as described for said skill, or null if the skill is not supported or is invalid.
	 */
	public static DTM getSkillDTM(Skills.SKILLS skill){
		switch(skill){
			case MAGIC:
				return getMagicSkillDTM();
			case PRAYER:
				return getPrayerSkillDTM();
			default:
				return null;
		}
	}
	
	// 26x20
	public static DTM getSkillsMenuDTM(){
		if(skillsMenuDTM != null)
			return skillsMenuDTM;
		DTMPoint point = new DTMPoint(new Color(40, 54, 63), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(6, 7), new Color(253, 92, 108)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 15), new Color(222, 8, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 15), new Color(219, 6, 33)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 10), new Color(244, 22, 43)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 2), new Color(64, 219, 169)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 9), new Color(9, 169, 110)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 13), new Color(20, 151, 104)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 17), new Color(31, 139, 98)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 12), new Color(68, 157, 253)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 14), new Color(2, 108, 228)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 17), new Color(0, 109, 186)), new Tolerance(10, 10, 10), 1)};
		skillsMenuDTM = new DTM(point, points);
		return skillsMenuDTM;
	}
	
	// 30x30
	public static DTM getHeroMenuButtonDTM(){
		if(heroMenuButtonDTM != null)
			return heroMenuButtonDTM;
		DTMPoint point = new DTMPoint(new Color(71, 82, 97), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(2, 7), new Color(211, 183, 97)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(2, 12), new Color(206, 168, 55)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 16), new Color(145, 83, 4)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 26), new Color(81, 92, 107)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 10), new Color(128, 131, 132)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 6), new Color(164, 127, 57)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 14), new Color(14, 13, 5)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 10), new Color(188, 145, 47)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 17), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 19), new Color(219, 224, 226)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 22), new Color(159, 167, 170)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(25, 22), new Color(137, 140, 137)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(25, 7), new Color(220, 196, 104)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 24), new Color(45, 49, 67)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 10), new Color(172, 207, 225)), new Tolerance(10, 10, 10), 1)};
		heroMenuButtonDTM = new DTM(point, points);
		return heroMenuButtonDTM;
	}
	
	// 30x30
	public static DTM getSkillsMenuButtonDTM(){
		if(skillsMenuButtonDTM != null)
			return skillsMenuButtonDTM;
		DTMPoint point = new DTMPoint(new Color(71, 82, 97), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(8, 12), new Color(253, 92, 108)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 19), new Color(223, 10, 34)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 21), new Color(30, 32, 44)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 8), new Color(58, 67, 91)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 7), new Color(64, 219, 169)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 16), new Color(12, 156, 102)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 21), new Color(19, 129, 84)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 15), new Color(52, 57, 75)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 17), new Color(68, 158, 253)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 20), new Color(2, 102, 210)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(24, 4), new Color(77, 90, 119)), new Tolerance(10, 10, 10), 1)};
		skillsMenuButtonDTM = new DTM(point, points);
		return skillsMenuButtonDTM;
	}
	
	// 30x30
	public static DTM getSkillsMenuButtonOffDTM(){
		if(skillsMenuButtonOffDTM != null)
			return skillsMenuButtonOffDTM;
		DTMPoint point = new DTMPoint(new Color(71, 82, 97), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(11, 9), new Color(195, 195, 195)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 21), new Color(55, 55, 59)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 15), new Color(163, 163, 163)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 11), new Color(91, 91, 91)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 5), new Color(53, 54, 55)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 14), new Color(163, 163, 163)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 16), new Color(114, 114, 114)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(24, 11), new Color(52, 60, 82)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 15), new Color(35, 37, 44)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 19), new Color(163, 163, 163)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 21), new Color(32, 32, 37)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 22), new Color(67, 67, 67)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 23), new Color(35, 35, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 6), new Color(50, 54, 69)), new Tolerance(10, 10, 10), 1)};
		skillsMenuButtonOffDTM = new DTM(point, points);
		return skillsMenuButtonOffDTM;
	}
	
	// 26x20
	public static DTM getBackPackMenuDTM(){
		if(backPackMenuDTM != null)
			return backPackMenuDTM;
		DTMPoint point = new DTMPoint(new Color(66, 81, 91), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(7, 4), new Color(106, 57, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 11), new Color(35, 31, 38)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 13), new Color(16, 20, 22)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 18), new Color(40, 25, 10)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 14), new Color(235, 197, 64)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 11), new Color(145, 107, 60)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 9), new Color(160, 130, 81)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 11), new Color(106, 69, 34)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 5), new Color(148, 80, 61)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 18), new Color(88, 67, 42)), new Tolerance(10, 10, 10), 1)};
		backPackMenuDTM = new DTM(point, points);
		return backPackMenuDTM;
	}
	
	// 30x30
	public static DTM getGearMenuButtonDTM(){
		if(gearMenuButtonDTM != null)
			return gearMenuButtonDTM;
		DTMPoint point = new DTMPoint(new Color(78, 57, 50), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(0, 11), new Color(89, 147, 149)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 4), new Color(80, 96, 92)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 6), new Color(133, 192, 209)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 9), new Color(86, 131, 134)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 12), new Color(63, 110, 112)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(28, 1), new Color(157, 101, 109)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(22, 6), new Color(177, 188, 190)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 12), new Color(159, 167, 170)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 18), new Color(240, 241, 243)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 21), new Color(25, 57, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 16), new Color(41, 87, 88)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 26), new Color(85, 65, 57)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(27, 26), new Color(83, 60, 51)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(27, 14), new Color(74, 45, 35)), new Tolerance(10, 10, 10), 1)};
		gearMenuButtonDTM = new DTM(point, points);
		return gearMenuButtonDTM;
	}
	
	// 30x30
	public static DTM getBackPackMenuButtonDTM(){
		if(backPackMenuButtonDTM != null)
			return backPackMenuButtonDTM;
		DTMPoint point = new DTMPoint(new Color(78, 57, 50), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(9, 9), new Color(82, 25, 16)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 20), new Color(136, 67, 35)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 22), new Color(16, 20, 22)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 9), new Color(148, 80, 61)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 18), new Color(235, 197, 64)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 21), new Color(40, 25, 10)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 12), new Color(106, 69, 34)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 16), new Color(122, 100, 35)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 14), new Color(238, 200, 115)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(26, 2), new Color(107, 77, 65)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(26, 27), new Color(83, 60, 51)), new Tolerance(10, 10, 10), 1)};
		backPackMenuButtonDTM = new DTM(point, points);
		return backPackMenuButtonDTM;
	}
	
	// 30x30
	public static DTM getBackPackMenuButtonOffDTM(){
		if(backPackMenuButtonOffDTM != null)
			return backPackMenuButtonOffDTM;
		DTMPoint point = new DTMPoint(new Color(78, 57, 50), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(8, 8), new Color(59, 59, 59)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 13), new Color(62, 52, 48)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 21), new Color(54, 51, 49)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 23), new Color(75, 75, 75)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 15), new Color(123, 123, 123)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 17), new Color(187, 187, 187)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 7), new Color(139, 139, 139)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 12), new Color(84, 84, 84)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 18), new Color(84, 84, 84)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 3), new Color(107, 77, 65)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(26, 27), new Color(83, 60, 51)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(2, 27), new Color(100, 76, 67)), new Tolerance(10, 10, 10), 1)};
		backPackMenuButtonOffDTM = new DTM(point, points);
		return backPackMenuButtonOffDTM;
	}
	
	// Do NOT use for clicking
	public static DTM getXPMenuDTM(){
		if(xpMenuDTM != null)
			return xpMenuDTM;
		DTMPoint point = new DTMPoint(new Color(24, 39, 48), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(80, 9), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(70, 20), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 17), new Color(200, 145, 53)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 19), new Color(156, 113, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 22), new Color(137, 100, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 24), new Color(245, 178, 65)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 20), new Color(232, 168, 61)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 19), new Color(211, 154, 56)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 24), new Color(222, 161, 59)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(34, 20), new Color(232, 168, 61)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(38, 23), new Color(52, 38, 14)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(52, 22), new Color(75, 54, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(60, 21), new Color(211, 154, 56)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(64, 19), new Color(245, 178, 65)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(64, 23), new Color(245, 178, 65)), new Tolerance(10, 10, 10), 1)};
		xpMenuDTM = new DTM(point, points);
		return xpMenuDTM;
	}
	
	// Do NOT use for clicking
	public static DTM getWorldChatDTM(){
		if(worldChatDTM != null)
			return worldChatDTM;
		DTMPoint point = new DTMPoint(new Color(27, 43, 52), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(28, 15), new Color(176, 194, 221)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 19), new Color(132, 211, 254)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(32, 14), new Color(132, 187, 231)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(42, 18), new Color(73, 105, 9)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(39, 22), new Color(104, 147, 8)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(43, 24), new Color(51, 98, 6)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(26, 23), new Color(25, 37, 45)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(34, 17), new Color(14, 95, 174)), new Tolerance(10, 10, 10), 1)};
		worldChatDTM = new DTM(point, points);
		return worldChatDTM;
	}
	
	// 10x10
	public static DTM getLogoutDTM(){
		if(logoutDTM != null)
			return logoutDTM;
		DTMPoint point = new DTMPoint(new Color(110, 62, 13), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(3, -2), new Color(57, 32, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(0, -3), new Color(164, 100, 29)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, -4), new Color(93, 52, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 0), new Color(150, 86, 10)), new Tolerance(10, 10, 10), 1)};
		logoutDTM = new DTM(point, points);
		return logoutDTM;
	}
	
	// 124x23
	public static DTM getLobbyDTM(){
		if(lobbyDTM != null)
			return lobbyDTM;
		DTMPoint point = new DTMPoint(new Color(79, 204, 240), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(10, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 12), new Color(3, 53, 82)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 2), new Color(62, 205, 248)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 19), new Color(4, 99, 156)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 12), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(34, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(35, 15), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(39, 8), new Color(14, 87, 121)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(72, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(72, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(77, 15), new Color(5, 74, 112)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(90, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(94, 10), new Color(1, 10, 15)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(90, 12), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(106, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(108, 16), new Color(1, 8, 12)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(112, 9), new Color(21, 136, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(118, 21), new Color(2, 76, 132)), new Tolerance(10, 10, 10), 1)};
		lobbyDTM = new DTM(point, points);
		return lobbyDTM;
	}
	
	// 124x23
	public static DTM getLogoutButtonDTM(){
		if(logoutButtonDTM != null)
			return logoutButtonDTM;
		DTMPoint point = new DTMPoint(new Color(239, 206, 100), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(13, 20), new Color(171, 99, 4)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 8), new Color(250, 195, 59)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(49, 2), new Color(250, 211, 90)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(33, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(33, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(37, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(41, 11), new Color(33, 25, 7)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(44, 8), new Color(33, 25, 7)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(47, 10), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(48, 13), new Color(45, 29, 6)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(45, 16), new Color(42, 29, 5)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(72, 11), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(74, 16), new Color(14, 9, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(78, 12), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(81, 8), new Color(67, 52, 16)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(88, 8), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(85, 16), new Color(0, 0, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(109, 1), new Color(251, 215, 103)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(111, 17), new Color(210, 139, 22)), new Tolerance(10, 10, 10), 1)};
		logoutButtonDTM = new DTM(point, points);
		return logoutButtonDTM;
	}
	
	// 138x14
	public static DTM getFightCaveTeleButtonDTM(){
		if(fightCaveTeleButtonDTM != null)
			return fightCaveTeleButtonDTM;
		DTMPoint point = new DTMPoint(new Color(89, 88, 87), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(-3, 6), new Color(184, 62, 17)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 2), new Color(175, 176, 177)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 3), new Color(189, 189, 189)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 6), new Color(88, 93, 96)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 9), new Color(183, 184, 184)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 8), new Color(115, 117, 117)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(25, 5), new Color(17, 27, 33)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(37, 2), new Color(183, 184, 184)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(41, 2), new Color(134, 138, 140)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(37, 8), new Color(190, 190, 191)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(40, 6), new Color(200, 200, 200)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(113, 10), new Color(17, 26, 31)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(133, 5), new Color(12, 18, 23)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(141, 7), new Color(150, 55, 16)), new Tolerance(10, 10, 10), 1)};
		fightCaveTeleButtonDTM = new DTM(point, points);
		return fightCaveTeleButtonDTM;
	}
	
	// 14x14
	public static DTM getBankCloseButtonDTM(){
		if(bankCloseButtonDTM != null)
			return bankCloseButtonDTM;
		DTMPoint point = new DTMPoint(new Color(171, 36, 21), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(3, 3), new Color(247, 216, 105)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 10), new Color(236, 157, 15)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(7, 6), new Color(245, 191, 64)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 10), new Color(236, 157, 15)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 3), new Color(247, 216, 105)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 6), new Color(190, 53, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 12), new Color(128, 4, 0)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-23, 7), new Color(194, 148, 54)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-21, 9), new Color(14, 12, 8)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-445, 7), new Color(1, 5, 10)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-439, 11), new Color(37, 55, 66)), new Tolerance(10, 10, 10), 1)};
		bankCloseButtonDTM = new DTM(point, points);
		return bankCloseButtonDTM;
	}
	
	// Do not use for clicking
	public static DTM getNatDTM(){
		if(natDTM != null)
			return natDTM;
		DTMPoint point = new DTMPoint(new Color(121, 116, 115), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(0, 7), new Color(107, 102, 102)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-3, 9), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-2, 3), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-4, 0), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-6, -2), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 1), new Color(126, 121, 121)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 1), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, -2), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(2, 3), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(1, 9), new Color(17, 125, 20)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 3), new Color(147, 140, 140)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 11), new Color(128, 123, 123)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 10), new Color(109, 104, 104)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-3, 15), new Color(70, 67, 67)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-10, 8), new Color(86, 82, 82)), new Tolerance(10, 10, 10), 1)};
		natDTM = new DTM(point, points);
		return natDTM;
	}
	
	// Do not use for clicking
	public static DTM getAstralDTM(){
		if(astralDTM != null)
			return astralDTM;
		DTMPoint point = new DTMPoint(new Color(194, 167, 193), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(-3, -4), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, -4), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, 5), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-4, 9), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-12, 0), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-1, 3), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-7, 0), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, -2), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(1, 1), new Color(194, 167, 193)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, -2), new Color(136, 130, 130)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 4), new Color(161, 154, 153)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 11), new Color(126, 121, 121)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-3, 12), new Color(77, 74, 73)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-10, 10), new Color(62, 60, 60)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-12, -1), new Color(95, 90, 90)), new Tolerance(10, 10, 10), 1)};
		astralDTM = new DTM(point, points);
		return astralDTM;
	}
	
	// 36x32
	public static DTM getPlankDTM(Log plankType){
		if(plankSlotDTM != null){
			switch(plankType){
				case OAK:
					return plankSlotDTM[1];
				case TEAK:
					return plankSlotDTM[2];
				case MAHOGANY:
					return plankSlotDTM[3];
				default:
					return plankSlotDTM[0];
			}
		}
		plankSlotDTM = new DTM[4];
		DTMPoint point = new DTMPoint(new Color(5, 19, 25), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(5, 12), new Color(8, 26, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 5), new Color(5, 23, 32)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(2, 28), new Color(15, 31, 38)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 26), new Color(127, 116, 98)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 19), new Color(98, 82, 54)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 12), new Color(82, 69, 46)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 4), new Color(91, 76, 51)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 17), new Color(71, 59, 39)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 8), new Color(73, 61, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 22), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 23), new Color(0, 0, 2)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 27), new Color(17, 37, 46)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 19), new Color(8, 26, 36)), new Tolerance(10, 10, 10), 1)};
		plankSlotDTM[0] = new DTM(point, points);
		point = new DTMPoint(new Color(5, 19, 25), new Tolerance(10, 10, 10));
		points = new DTMSubPoint[]{new DTMSubPoint(new ColourPoint(new Point(9, 5), new Color(12, 30, 40)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 15), new Color(7, 25, 35)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 28), new Color(16, 32, 40)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 3), new Color(10, 26, 34)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 4), new Color(112, 89, 62)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 17), new Color(124, 99, 69)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 12), new Color(96, 76, 53)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 29), new Color(0, 0, 2)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 24), new Color(114, 91, 63)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 26), new Color(188, 165, 125)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(15, 15), new Color(116, 92, 64)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, 19), new Color(96, 76, 53)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(24, 10), new Color(85, 74, 56)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 19), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 15), new Color(0, 0, 2)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 21), new Color(13, 31, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(24, 29), new Color(13, 31, 41)), new Tolerance(10, 10, 10), 1)};
		plankSlotDTM[1] = new DTM(point, points);
		point = new DTMPoint(new Color(5, 19, 25), new Tolerance(10, 10, 10));
		points = new DTMSubPoint[]{new DTMSubPoint(new ColourPoint(new Point(9, 7), new Color(16, 33, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 17), new Color(11, 28, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, 29), new Color(17, 37, 46)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(16, 1), new Color(10, 25, 32)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(23, 5), new Color(73, 59, 32)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 10), new Color(87, 70, 38)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(18, 15), new Color(78, 62, 34)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 21), new Color(98, 78, 43)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 26), new Color(82, 66, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 27), new Color(71, 57, 31)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, 26), new Color(137, 120, 91)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(24, 12), new Color(0, 0, 2)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 22), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 12), new Color(0, 0, 2)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 21), new Color(13, 31, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 27), new Color(13, 31, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(20, 27), new Color(9, 30, 41)), new Tolerance(10, 10, 10), 1)};
		plankSlotDTM[2] = new DTM(point, points);
		point = new DTMPoint(new Color(5, 19, 25), new Tolerance(10, 10, 10));
		points = new DTMSubPoint[]{new DTMSubPoint(new ColourPoint(new Point(4, 26), new Color(16, 33, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(21, 3), new Color(71, 53, 39)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(14, 25), new Color(63, 48, 35)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(19, 14), new Color(61, 46, 34)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(29, 23), new Color(8, 26, 36)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 10), new Color(13, 30, 38)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 17), new Color(0, 0, 2)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(26, 10), new Color(0, 0, 1)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 27), new Color(108, 82, 60)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 13), new Color(12, 30, 40)), new Tolerance(10, 10, 10), 1)};
		plankSlotDTM[3] = new DTM(point, points);
		switch(plankType){
			case OAK:
				return plankSlotDTM[1];
			case TEAK:
				return plankSlotDTM[2];
			case MAHOGANY:
				return plankSlotDTM[3];
			default:
				return plankSlotDTM[0];
		}
	}
	
	// Do not use for clicking
	public static DTM getPlainLogDTM(Log plankType){
		if(plainLogDTM != null){
			switch(plankType){
				case OAK:
					return plainLogDTM[1];
				case TEAK:
					return plainLogDTM[2];
				case MAHOGANY:
					return plainLogDTM[3];
				default:
					return plainLogDTM[0];
			}
		}
		plainLogDTM = new DTM[4];
		DTMPoint point = new DTMPoint(new Color(64, 48, 28), new Tolerance(10, 10, 10));
		DTMSubPoint points[] = {new DTMSubPoint(new ColourPoint(new Point(7, -5), new Color(97, 73, 43)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-7, -6), new Color(130, 105, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-12, 5), new Color(79, 56, 24)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-5, 7), new Color(130, 105, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 8), new Color(92, 69, 41)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(15, 6), new Color(62, 47, 27)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(17, -1), new Color(74, 56, 33)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 0), new Color(84, 63, 37)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-4, -3), new Color(97, 73, 43)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-2, 6), new Color(97, 73, 43)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-6, 4), new Color(130, 105, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, -1), new Color(72, 54, 32)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(15, 3), new Color(92, 69, 41)), new Tolerance(10, 10, 10), 1)};
		plainLogDTM[0] = new DTM(point, points);
		point = new DTMPoint(new Color(107, 81, 47), new Tolerance(10, 10, 10));
		points = new DTMSubPoint[]{new DTMSubPoint(new ColourPoint(new Point(-1, 4), new Color(130, 98, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, -4), new Color(159, 127, 89)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-13, 6), new Color(145, 116, 81)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-9, 7), new Color(159, 127, 89)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(5, -5), new Color(125, 94, 55)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-5, -4), new Color(132, 99, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(6, 4), new Color(136, 102, 60)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 4), new Color(132, 99, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-2, 9), new Color(119, 89, 52)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 4), new Color(107, 81, 47)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(11, 0), new Color(115, 87, 51)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-16, 6), new Color(115, 81, 35)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, 8), new Color(159, 127, 89)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, -2), new Color(130, 98, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-10, 4), new Color(155, 124, 87)), new Tolerance(10, 10, 10), 1)};
		plainLogDTM[1] = new DTM(point, points);
		point = new DTMPoint(new Color(123, 103, 69), new Tolerance(10, 10, 10));
		points = new DTMSubPoint[]{new DTMSubPoint(new ColourPoint(new Point(-12, 6), new Color(201, 169, 113)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-13, 2), new Color(225, 189, 126)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, 2), new Color(128, 97, 57)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, 6), new Color(128, 97, 57)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-9, 6), new Color(121, 91, 53)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-8, 2), new Color(152, 128, 85)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-4, 4), new Color(204, 172, 114)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-6, 7), new Color(132, 99, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-5, 10), new Color(132, 99, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, 7), new Color(172, 145, 97)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(12, 3), new Color(174, 146, 97)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(8, -5), new Color(177, 149, 99)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(0, -3), new Color(176, 148, 98)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-7, -4), new Color(132, 99, 58)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(3, -3), new Color(174, 146, 97)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(13, 6), new Color(128, 108, 72)), new Tolerance(10, 10, 10), 1)};
		plainLogDTM[2] = new DTM(point, points);
		point = new DTMPoint(new Color(128, 108, 72), new Tolerance(10, 10, 10));
		points = new DTMSubPoint[]{new DTMSubPoint(new ColourPoint(new Point(-16, 7), new Color(95, 60, 29)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-17, 2), new Color(77, 49, 23)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-15, 5), new Color(79, 46, 11)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-13, 4), new Color(72, 41, 10)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-12, 3), new Color(150, 126, 84)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-8, 11), new Color(101, 65, 31)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-9, 6), new Color(81, 47, 11)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, 10), new Color(81, 47, 11)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(9, 3), new Color(172, 145, 97)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-2, 7), new Color(169, 142, 95)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-1, 4), new Color(164, 138, 92)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(10, 6), new Color(154, 129, 86)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(4, -4), new Color(177, 149, 99)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-5, -2), new Color(174, 146, 97)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, -4), new Color(81, 47, 11)), new Tolerance(10, 10, 10), 1), new DTMSubPoint(new ColourPoint(new Point(-11, -1), new Color(81, 47, 11)), new Tolerance(10, 10, 10), 1)};
		plainLogDTM[3] = new DTM(point, points);
		switch(plankType){
			case OAK:
				return plainLogDTM[1];
			case TEAK:
				return plainLogDTM[2];
			case MAHOGANY:
				return plainLogDTM[3];
			default:
				return plainLogDTM[0];
		}
	}
}