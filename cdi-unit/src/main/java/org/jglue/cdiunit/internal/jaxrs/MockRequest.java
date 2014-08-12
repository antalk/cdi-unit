/*
 *    Copyright 2014 Bryn Cooke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jglue.cdiunit.internal.jaxrs;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Variant;


public class MockRequest implements Request
{

	public MockRequest(HttpServletRequest httpServletRequest) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Variant selectVariant(List<Variant> variants) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBuilder evaluatePreconditions(EntityTag eTag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBuilder evaluatePreconditions(Date lastModified) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBuilder evaluatePreconditions(Date lastModified, EntityTag eTag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBuilder evaluatePreconditions() {
		// TODO Auto-generated method stub
		return null;
	}
   
}