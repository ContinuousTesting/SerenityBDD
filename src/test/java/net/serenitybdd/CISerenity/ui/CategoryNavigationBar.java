package net.serenitybdd.CISerenity.ui;

import org.openqa.selenium.By;

import model.Category;
import net.serenitybdd.core.pages.PageObject;

public class CategoryNavigationBar extends PageObject{
	public void selectCategory() {
		$("//li[3]/a/span[2]").click();
}}
