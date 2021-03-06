
package com.aysidisi.worldofdayum.avatar.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aysidisi.plainspringwebapp.web.core.ViewManager;
import com.aysidisi.plainspringwebapp.web.core.ViewTemplate;
import com.aysidisi.worldofdayum.avatar.model.Avatar;
import com.aysidisi.worldofdayum.avatar.service.AvatarService;

@Controller
public class AvatarController
{

	@Autowired
	private AvatarService avatarService;

	@RequestMapping(value = "/avatars/{avatarId}", method = RequestMethod.GET)
	public ModelAndView details(@PathVariable final ObjectId avatarId)
	{
		ModelAndView modelAndView = ViewManager.generateModelAndView(ViewTemplate.mainTemplate,
				"avatar/avatar");
		Avatar avatar = this.avatarService.findOne(avatarId);
		if (avatar == null)
		{
			modelAndView = new ModelAndView("redirect:/avatars/");
		}
		else
		{
			modelAndView.addObject("avatar", avatar);
		}
		return modelAndView;

	}
}
