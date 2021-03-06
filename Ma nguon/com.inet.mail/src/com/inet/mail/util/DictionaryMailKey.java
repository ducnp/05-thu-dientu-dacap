/*****************************************************************
   Copyright 2006 by Dung Nguyen (dungnguyen@truthinet.com)

   Licensed under the iNet Solutions Corp.,;
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.truthinet.com/licenses

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*****************************************************************/
package com.inet.mail.util;

/**
 * WorkflowDictionaryKey
 *
 * @author <a href="mailto:dungnguyen@truthinet.com">Dung Nguyen</a>
 * @version 1.0i
 */
public interface DictionaryMailKey {
	/**
	 * On this computer.
	 */
	public static final String MAIL_ON_THIS_COMPUTER = "MAIL_ON_THIS_COMPUTER" ;
	
	/**
	 * Mail INBOX.
	 */
	public static final String MAIL_INBOX = "MAIL_INBOX" ;
	
	/**
	 * Mail OUTBOX.
	 */
	public static final String MAIL_OUTBOX = "MAIL_OUTBOX" ;
	
	/**
	 * Mail SENT.
	 */
	public static final String MAIL_SENT = "MAIL_SENT" ;
	
	/**
	 * Mail DRAFT.
	 */
	public static final String MAIL_DRAFT = "MAIL_DRAFT" ;
	
	/**
	 * Mail SPAM.
	 */
	public static final String MAIL_SPAM = "MAIL_SPAM" ;
	
	/**
	 * Mail TRASH.
	 */
	public static final String MAIL_TRASH = "MAIL_TRASH" ;
}
