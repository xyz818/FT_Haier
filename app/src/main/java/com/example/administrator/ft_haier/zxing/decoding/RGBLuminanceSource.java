�}�  }   �:��~\=U �a	��Lm#�>���,�^mYj�`	iL�'�jo�5�CK���E���s�	�M[r�+^�&#��a�΅�eЁ�?��my���܃w�U�P���E���M�X��!��"�>&f�����a#�Ր	���V�T
wf��2��y�K�H��U#>yPP�
�|�-Trb�#_3�a�uԂ]TH��f���p�?(t�	w�&[�r�R�j��aS��:�Z�f�6S���z:�!Z�j����TM�"�a4Z���|fI���@&�Q���sC�|D>�J��B�,�՘�����׬���?9'뫽�XX�2w�0�2�U�}��hV�8��J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l+z�O��o��;�=~̠��A/�{'��m8�����:�+u�hb�����u�y�"KB/��k�LrP7h�-����I�m�`hr�n�Q��i��ް����Jl����Y�p+�`��eKl5?�{Q�B�RE���������PC A��� ��rx�t(r~�2��2K��d�aٳ�*]�Yua
���,R@���<HV��^�|}؅_��n�N��ҦG�N�f�5�ʁZ�5��D�0��Jm�.��K��)P\��ύl@"�o3�
�D5�	gvQ�(}��/-�8�/��F9jy�»؞'�T ��@�tM��6�������Y��5���@Ml�	�HO�An�o��%a�̟�.���`\�<�1�'[Q�����ۦK��������3������Z��H�Pǒ�#�F}Ԕ:�L]��������t`����R]ovgS���ח�������<y. �Z�+�:`�asH����d~�nF�y�E��0�о2kl�,�[A3U��)|(�+�9k� ����;��r	+���K�9�\�}����I�ԋ�IgC�*�^��\���S�'�
����y��\���Q����YM�yIw}[���bR�#ϓB	X�~gt���0��B���ކt��	%��⋿��m�)��f�kS��cz.gO��:��X���>�U��ӂ;��ՁX;ɗ��?d܂��{��`�.���ˡ #(��+�)-Ò�D)p�����d�蘵~ !u�w{�y�ұ���x���Yչ`ǋ�Gz��ZN	Ѩ�@��2�IL��j�� ,؆d&���*S�^u��0�9�<�@�!\���C�acl��i����>��*����	�gi�T;tM?����e���k�C+�����3R��i���6	� Eb�V:����EJ9�1�7Ӭ�d�����\�w�b���ſ������E�Z��Nyq>ȯE���^�ԋb�:��y%�,��w�z�ԻǇ9af����b������IP��l�,na](i�Ȏ���e+(�#�%Z4v�Ǐ�""0���KO���H9�e!<����وOq�ԓ�\��TW�+z��be-��.E�@�i)��3��9��Wi0.a���90�;�h
��z|�o�>���L�u��7Z�4`kձ��+�Ym:��#D?4!��w�~�R�f��R����x	WL��w�@�]�'��39i+La#Z����	}dY���Q���-��b(�NXT=�&~(]�I��`����L���M�^I�����d`��/L��$��&��}i�!�ҋӲ�ߪ�&\����?Wm
ޞ.�n���ET{�h����ֆ%����;r���罢�W���q�I W�:nb� ��a�/@��Aj^|�VAm��J>L�����mӭ �c�ͧ\�X���
��(���R��y(�G�v�eǐ�>LE%�,��gę�B��9w�$ħ�D�Ҹ(ħ��4��f�u�#��Y��Ws��I�D�C9	!�$�[�����l1_R:�Y�B��f%������{{M�e��(�	���^?_q���)Md�du~|����tME#�k���U\w�������&�G��ej�W����y''|2}�j�Mݦ��Y Тt�I�Ij5 .���Q˚~��}�7���g!9�>j�'�i}m$6x���X�?����24��ãU3��#-� �i���Մ�pFs^6_3-�1�Ihg�M�9�hף�`]����'b���\\���(`�2I�H)ﰆ��L9���\�R�����4�Wesԟ*�׻��@�wWz[���/,D7Np�!+�]é:�b뾵���F'����j	ƿ����сȸ�i5D�0�[t阁+*0m�;� �7͊�[H���$8�/d@__MZ���Z�_H�Ԛ漯;�V[����tr��B��a�Vg)
��,e�z9[OK�]��Щt�����Y���b��f��l~��3��bZf��Kasu	S��s��%})�&�h�-s support cropping, the underlying byte array
	// already contains
	// exactly what the caller is asking for, so give it to them without a copy.
	@Override
	public byte[] getMatrix() {
		return luminances;
	}

	private static Bitmap loadBitmap(String path) throws FileNotFoundException {
		Bitmap bitmap = BitmapFactory.decodeFile(path);
		if (bitmap == null) {
			throw new FileNotFoundException("Couldn't open " + path);
		}
		return bitmap;
	}

}
