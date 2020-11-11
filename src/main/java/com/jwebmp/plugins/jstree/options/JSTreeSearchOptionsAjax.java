/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jstree.options;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;

/**
 * a jQuery-like AJAX config, which jstree uses if a server should be queried for results. A str (which is the search string) parameter will be added with the request, an optional
 * inside parameter
 * will be added if the search is limited to a node id. The expected result is a JSON array with nodes that need to be opened so that matching nodes will be revealed. Leave this
 * setting as false to
 * not query the server. You can also set this to a function, which will be invoked in the instance's scope and receive 3 parameters - the search string, the callback to call with
 * the array of nodes
 * to load, and the optional node ID to limit the search to
 *
 * @author GedMarc
 * @version 1.0
 * @since 23 Dec 2016
 */
public class JSTreeSearchOptionsAjax<J extends JSTreeSearchOptionsAjax<J>>
		extends JSTreeAjaxConfigOptions<J>
{


	/**
	 * a jQuery-like AJAX config, which jstree uses if a server should be queried for results. A str (which is the search string) parameter will be added with the request, an
	 * optional inside parameter
	 * will be added if the search is limited to a node id. The expected result is a JSON array with nodes that need to be opened so that matching nodes will be revealed. Leave
	 * this setting as false
	 * to not query the server. You can also set this to a function, which will be invoked in the instance's scope and receive 3 parameters - the search string, the callback to
	 * call with the array of
	 * nodes to load, and the optional node ID to limit the search to
	 */
	@JsonProperty("str")
	private String searchString;
	/**
	 * an optional inside parameter will be added if the search is limited to a node id.
	 */
	@JsonProperty("inside")
	private String limitedTo;

	public JSTreeSearchOptionsAjax()
	{
		//Nothing Needed
	}

	/**
	 * a jQuery-like AJAX config, which jstree uses if a server should be queried for results. A str (which is the search string) parameter will be added with the request, an
	 * optional inside parameter
	 * will be added if the search is limited to a node id. The expected result is a JSON array with nodes that need to be opened so that matching nodes will be revealed. Leave
	 * this setting as false
	 * to not query the server. You can also set this to a function, which will be invoked in the instance's scope and receive 3 parameters - the search string, the callback to
	 * call with the array of
	 * nodes to load, and the optional node ID to limit the search to
	 *
	 * @return
	 */
	public String getSearchString()
	{
		return searchString;
	}

	/**
	 * a jQuery-like AJAX config, which jstree uses if a server should be queried for results. A str (which is the search string) parameter will be added with the request, an
	 * optional inside parameter
	 * will be added if the search is limited to a node id. The expected result is a JSON array with nodes that need to be opened so that matching nodes will be revealed. Leave
	 * this setting as false
	 * to not query the server. You can also set this to a function, which will be invoked in the instance's scope and receive 3 parameters - the search string, the callback to
	 * call with the array of
	 * nodes to load, and the optional node ID to limit the search to
	 *
	 * @param searchString
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSearchString(String searchString)
	{
		this.searchString = searchString;
		return (J) this;
	}

	/**
	 * an optional inside parameter will be added if the search is limited to a node id.
	 *
	 * @return
	 */
	public String getLimitedTo()
	{
		return limitedTo;
	}

	/**
	 * an optional inside parameter will be added if the search is limited to a node id.
	 *
	 * @param limitedTo
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLimitedTo(String limitedTo)
	{
		this.limitedTo = limitedTo;
		return (J) this;
	}

}
