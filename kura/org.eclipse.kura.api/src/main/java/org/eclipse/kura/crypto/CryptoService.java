/**
 * Copyright (c) 2011, 2014 Eurotech and/or its affiliates
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Eurotech
 */
package org.eclipse.kura.crypto;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * The CryptoService is used to provide AES encrypt and decrypt functionality, Base64 encoding and
 * decoding, and SHA1 hash generation. 
 *
 */
public interface CryptoService 
{
	/**
	 * Returns an AES encrypted string based on the provided value.
	 * 
	 * @param value A string that will be encrypted.
	 * @return String that has been encrypted.
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public String encryptAes(String value) 
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException;

	/**
	 * Returns a plain text string based on the provided encrypted value.
	 * 
	 * @param encryptedValue A string representing the value to be decrypted.
	 * @return String that has been decrypted.
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws IOException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public String decryptAes(String encryptedValue) 
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException;
	
	/**
	 * Returns a SHA1 hashed value of the provided string s.
	 * @param s A string on which to run the SHA1 hasing algorithm.
	 * @return String that has been hashed.
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public String sha1Hash(String s) 
			throws NoSuchAlgorithmException, UnsupportedEncodingException;
			
	/**
	 * Returns an encoded string based on the provided stringValue.
	 * @param stringValue A string to be encoded.
	 * @return String that has been encoded.
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public String encodeBase64(String stringValue)
			throws NoSuchAlgorithmException, UnsupportedEncodingException;
	
	/**
	 * Returns a decoded string based on the provided encodedValue.
	 * @param encodedValue A string to be decoded.
	 * @return String that has been decoded.
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public String decodeBase64(String encodedValue) 
			throws NoSuchAlgorithmException, UnsupportedEncodingException;

}
