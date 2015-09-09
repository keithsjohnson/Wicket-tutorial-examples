/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tutorialWicket.mountedpages;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.tutorialWicket.mountedpages.subPackage.StatefulPackageMount;
import org.tutorialWicket.mountedpages.subPackage.StatelessPackageMount;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.link.StatelessLink;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
		add(new Link("statefulPageMount") {

			@Override
			public void onClick() {
				PageParameters pageParameters = new PageParameters();
				
				setResponsePage(MountedPage.class, pageParameters);
			}
			
		});
		
		add(new Link("mountedPageWithPlaceholder") {

			@Override
			public void onClick() {
				PageParameters pageParameters = new PageParameters();
				pageParameters.add("foo", "foo");
				
				setResponsePage(MountedPageWithPlaceholder.class,pageParameters);
			}
			
		});
		
    	add(new Link("statelessPackage") {

			@Override
			public void onClick() {
				setResponsePage(StatelessPackageMount.class);
			}
		});
		
		add(new Link("statefulPackage") {

			@Override
			public void onClick() {
				
				setResponsePage(StatefulPackageMount.class);
			}
		});
				
    }
}